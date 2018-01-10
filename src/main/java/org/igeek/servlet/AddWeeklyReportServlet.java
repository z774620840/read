package org.igeek.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.igeek.pojo.WeeklyReport;
import org.igeek.service.MileStoneService;
import org.igeek.service.WeeklyReportService;
import org.igeek.service.Impl.MileStoneServiceImpl;
import org.igeek.service.Impl.WeeklyReportListImpl;
import org.igeek.util.Upload;

@WebServlet("/addWeeklyReport.html")
public class AddWeeklyReportServlet extends HttpServlet{
	private MileStoneService mileStoneService = new MileStoneServiceImpl();
	private WeeklyReportService weeklyReportService = new WeeklyReportListImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String project_Id = request.getParameter("pid");
		request.setAttribute("project_Id", project_Id);
		List<Object> milestoneList = mileStoneService.getMileStones(project_Id);
		request.setAttribute("milestoneList",milestoneList);
		request.getRequestDispatcher("WEB-INF/jsp/add_project_weekly.jsp").forward(request, response);
	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getParameter("pid")!=null){
			doGet(request, response);
			return ;
		}
		List<Object> params = new ArrayList<Object>();
		WeeklyReport w = new WeeklyReport();
		boolean flag = false;//判断是否有附件
		//得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
		String savePath = this.getServletContext().getRealPath("/WEB-INF/upload");
		File file = new File(savePath);
		//判断上传文件的保存目录是否存在
		if (!file.exists() && !file.isDirectory()) {
			System.out.println(savePath+"目录不存在，需要创建");
		    //创建目录
		    file.mkdir();
		}
		//1、创建一个DiskFileItemFactory工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
		//2、创建一个文件上传解析器
        ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> list = null;
		try {
			list = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(FileItem item : list){
            //如果fileitem中封装的是普通输入项的数据
            if(item.isFormField()){
            	//String name = item.getFieldName();
            	//解决普通输入项的数据的中文乱码问题
            	String value = item.getString("UTF-8");
            	params.add(value);
            	
            }else{//如果fileitem中封装的是上传文件
            	InputStream stream=item.getInputStream();//上传文件需要的文件流参数
            	String filename=item.getName();   //上传文件需要的参数
            	w.setweekly_Report_Accessory(filename);
            	flag= true;
                File path=new File(savePath);  //这个要自己写具体的路径，是需要上传文件需要的参数
                if(filename==null || filename.trim().equals("")){
                    continue;
                }
                Upload.uploadFile(stream, path,filename);   //调用工具类方法
            }
		}
		if((params.size()!=9&&flag) || (params.size()!=8 && !flag) ){
			request.setAttribute("errorMsg","表单不能为空");
			String pid = (String) params.get(params.size()-1);
			request.getRequestDispatcher("addWeeklyReport.html?pid="+pid).forward(request, response);
		}else{
			String week = (String) params.get(0);
			
			week = week.split("-W")[0]+"年第"+week.split("-W")[1]+"周";
			w.setWeek(week);
			w.setProgress(Integer.parseInt((String) params.get(1)));
			w.setprogress_Status(Integer.parseInt((String) params.get(2)));
			w.setprogress_Remark((String)params.get(3));
			w.setmilestone_Id(Integer.parseInt((String) params.get(4)));
			w.setissend_Email((String)params.get(5)=="1"?true:false);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				w.setplan_Time(sdf.parse((String) params.get(6)));
				w.setactual_Time(sdf.parse((String) params.get(7)));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			w.setweekly_Report_Name("项目周报"+(String)params.get(0));
			w.setproject_Id((String)params.get(8));
			Integer row = weeklyReportService.insertWeeklyReport(w);
			if(row>0){
				response.sendRedirect("project_unified_view.html?pid="+(String)params.get(8));
			}
		}
	}

}
