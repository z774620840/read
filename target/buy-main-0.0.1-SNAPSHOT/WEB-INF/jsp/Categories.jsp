<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>iRead | 欢迎来到爱阅读网络书屋</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="topbar">
		<div id="TopSection">
			<h1 id="sitename">
				<span><a href="#">I</a></span><a href="#">Read</a>
			</h1>
			<div id="topbarnav">
				<span class="topnavitems"><a href="3">注册</a> | <a href="3">登录
				</a></span>
				<form action="#">
					<div class="searchform">
						<label for="searchtxt"> 找书: </label> <input class="keywordfield"
							id="searchtxt" /> <input type="submit" value="搜索" />
					</div>
				</form>
			</div>
			<div class="clear"></div>
			<ul id="topmenu">
				<li><a href="bookindex.html">首页</a></li>
				<li class="active"><a href="Categories.html">分类</a></li>
				<li><a href="table.html">排行榜</a></li>
				<li><a href="form.html">推荐</a></li>
				<li><a href="notes.html">免费</a></li>
			</ul>
		</div>
	</div>

	<div id="wrap">
		<div id="headershort">
			<h2 class="subheader">Blog</h2>
		</div>
		<div id="contents">
			<div id="left">
				<h2>
					<a href="#">Blog Example</a>
				</h2>
				<p class="postdata">Posted on 27/10/2007 by UserName</p>
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
					Integer ac orci. Vestibulum rutrum. Praesent a lectus. Nam ultrices
					euismod dolor. Donec rutrum felis et mauris. Vestibulum nisl. Ut
					ultrices. Nunc adipiscing est ultrices augue. Aliquam commodo. Ut
					iaculis tortor eu augue. Nullam mattis, turpis sed suscipit
					euismod, est enim fermentum lorem, ac ornare est turpis eget
					ligula.</p>
				<h3>Heading 3 - Blockquote</h3>
				<blockquote>
					<p>Donec dictum nibh nec est. Aliquam sagittis, lacus a
						pharetra tempor, enim justo tempor nisi, at aliquet nulla metus
						sed augue. Praesent sed nibh. Vestibulum bibendum enim ut nisi
						fringilla accumsan. Nullam dapibus fermentum nulla. Phasellus in
						orci vel justo facilisis iaculis. Quisque facilisis ornare felis.
						Curabitur nunc libero, dapibus vel, commodo nec, semper a, massa.
						Suspendisse potenti.</p>
				</blockquote>
				<h4>Heading 4 - List Example</h4>
				<h4>Unordered List</h4>
				<ul>
					<li>Lorem ipsum dolor sit amet</li>
					<li>Consectetuer adipiscing elit.</li>
					<li>In nonummy, ipsum a varius gravida, justo justo sagittis
						felis, convallis ornare odio erat sed leo.</li>
					<li>Sed laoreet massa ac erat iaculis faucibus.</li>
					<li>Maecenas dapibus.</li>
				</ul>
				<p></p>
				<h3>Ordered List</h3>
				<p>Ordred List Example</p>
				<ol>
					<li>Suspendisse ac sapien in turpis rutrum consectetuer.</li>
					<li>Quisque vel tellus.</li>
					<li>Sed orci turpis, rutrum sed, commodo eu, ullamcorper sit
						amet, velit.</li>
					<li>Praesent malesuada, enim sit amet pretium ultrices, libero
						libero vulputate metus, a porttitor magna nulla nec massa.</li>
				</ol>
				<img class="alignleft" src="images/3.jpg" alt="Image 2" />
				<p>Vestibulum venenatis. Nulla vel ipsum. Proin rutrum, urna sit
					amet bibendum pellentesque, ante sapien varius turpis, eu nonummy
					nunc urna scelerisque ante. Nunc sed leo at dolor pharetra
					facilisis. Sed sed lectus at justo dapibus tristique. Morbi
					molestie pulvinar elit. Donec dictum nibh nec est. Aliquam
					sagittis, lacus a pharetra tempor, enim justo tempor nisi, at
					aliquet nulla metus sed augue. Praesent sed nibh. Vestibulum
					bibendum enim ut nisi fringilla accumsan. Nullam dapibus fermentum
					nulla. Phasellus in orci vel justo facilisis iaculis. Quisque
					facilisis ornare felis. Curabitur nunc libero, dapibus vel, commodo
					nec, semper a, massa. Suspendisse potenti. Morbi a nisl. Nunc
					euismod elit non lectus.</p>
				<p class="postmetadata">No Comment | Add Comment | Category</p>
				<h2>
					<a href="#">Comments Example</a>
				</h2>
				<p class="postdata">Posted on 27/10/2007 by UserName</p>

				<img class="alignright" src="images/1.jpg" alt="Image 3" />
				<p>Cras velit libero, lacinia ut, euismod at, semper suscipit,
					elit. Ut nec mauris at diam dignissim aliquam. Donec eu mi at nisl
					sagittis tincidunt. Pellentesque feugiat molestie nunc. In
					lobortis, est eget bibendum hendrerit, ipsum augue venenatis lorem,
					nec sodales metus arcu sit amet nisi. Duis iaculis orci et tortor.
					Cum sociis natoque penatibus et magnis dis parturient montes,
					nascetur ridiculus mus. Duis id lacus. Praesent faucibus, mauris et
					lobortis tristique, mi justo consectetuer nulla, et pretium mauris
					lacus ut elit. Etiam leo leo, auctor eget, tristique eu, ultrices
					eu, lorem. Nulla facilisi. Praesent imperdiet ante elementum nisi
					vestibulum pharetra. Aliquam ullamcorper, lectus ut rhoncus
					gravida, ligula velit porttitor nisi, non laoreet diam dui ac
					mauris. Class aptent taciti sociosqu ad litora torquent per conubia
					nostra, per inceptos hymenaeos. Cras pharetra pulvinar dolor.</p>

				<p class="postmetadata">No Comment | Add Comment | Category</p>
				<div id="commenttpl">

					<p class="nocomments">This post is password protected.</p>


					<h5 id="comments">5 Comments in response to &quot;Image in a
						post&quot;</h5>

					<ol class="commentlist">


						<li><cite>UserOne</cite> <small class="commentmeta">Posted
								on 23/10/2007 at 10:15 AM</small> <span class="commenttxt">Praesent
								erat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a
								facilisis porttitor, ligula nisl rhoncus purus, vel placerat
								nulla metus eget erat.</span></li>

						<li><cite>UserOne</cite> <small class="commentmeta">Posted
								on 23/10/2007 at 10:15 AM</small> <span class="commenttxt">Praesent
								erat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a
								facilisis porttitor, ligula nisl rhoncus purus, vel placerat
								nulla metus eget erat.</span></li>

						<li><cite>UserOne</cite> <small class="commentmeta">Posted
								on 23/10/2007 at 10:15 AM</small> <span class="commenttxt">Praesent
								erat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a
								facilisis porttitor, ligula nisl rhoncus purus, vel placerat
								nulla metus eget erat.</span></li>

						<li><cite>UserOne</cite> <small class="commentmeta">Posted
								on 23/10/2007 at 10:15 AM</small> <span class="commenttxt">Praesent
								erat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a
								facilisis porttitor, ligula nisl rhoncus purus, vel placerat
								nulla metus eget erat.</span></li>

						<li><cite>UserOne</cite> <small class="commentmeta">Posted
								on 23/10/2007 at 10:15 AM</small> <span class="commenttxt">Praesent
								erat. Nulla venenatis lorem quis nisi. Aliquam congue, pede a
								facilisis porttitor, ligula nisl rhoncus purus, vel placerat
								nulla metus eget erat.</span></li>
					</ol>

					<h5 class="subhead" id="respond">Leave a Reply</h5>

					<p>
						You must be <a href="#">logged in</a> to post a comment.
					</p>


					<form action="#" method="post" id="commentform">

						<p>
							Logged in as <a href="#">UserName</a>. <a href="#"
								title="Log out of this account">Logout &raquo;</a>
						</p>

						<p>
							<input class="textfield" type="text" name="author" id="author"
								size="22" tabindex="1" /> <label for="author"><small>Name
							</small></label>
						</p>

						<p>
							<input class="textfield" type="text" name="email" id="email"
								size="22" tabindex="2" /> <label for="email"><small>Mail
									(will not be published) </small></label>
						</p>

						<p>
							<input class="textfield" type="text" name="url" id="url"
								size="22" tabindex="3" /> <label for="url"><small>Website</small></label>
						</p>


						<p>
							<textarea class="textfield" name="comment" id="comment" cols="55"
								rows="10" tabindex="4"></textarea>
						</p>
						<p>
							<input name="submit" type="submit" id="submit" tabindex="5"
								value="Submit Comment" />
						</p>
					</form>

				</div>

			</div>

			<div id="sidebar">
				<ul>
					<li><h2>Categories</h2></li>
					<li>
						<ul id="categories">
							<li><a href="#">Web Design</a></li>
							<li><a href="#">Graphic design</a></li>
							<li><a href="#">Tutorials</a></li>
							<li><a href="#">Tips &amp; Tricks</a></li>
							<li><a href="#">Gadgets</a></li>
							<li><a href="#">3D Animation</a></li>
						</ul>
					</li>
					<li>
						<h2>Blogroll</h2>
					</li>
					<li>
						<ul id="blogroll">
							<li><a href="http://opendesigns.org">The Open Designs
									Community</a></li>
							<li><a href="http://ramblingsoul.com">Rambling Soul</a></li>
							<li><a href="http://www.cssfreebies.com">CSS Freebies</a></li>
						</ul>
					</li>
					<li><h2>Recent Entries</h2></li>
					<li id="recententries">
						<ul>
							<li><a href="#">Lorem Ipsum Dolor Sit</a></li>
							<li><a href="#">Cras Velit Libero, Lacinia ut, Euismod
									at</a></li>
							<li><a href="#"> Aliquam sagittis, lacus a pharetra
									tempor, enim justo tempor nisi, at aliquet nulla metus sed
									augue.</a></li>
							<li><a href="#"> Praesent sed nibh. </a></li>

						</ul>
					</li>

				</ul>
			</div>


			<div class="clear"></div>

		</div>
	</div>

	<div id="footer">
		<div id="footercontent">
			<div id="previews">
				<div class="item">
					<a href="#"><img src="images/1.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/2.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/3.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/4.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/2.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/1.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="item">
					<a href="#"><img src="images/3.jpg" alt="Photo 1" /></a> <span
						class="caption">Image Caption</span>
				</div>
				<div class="clear"></div>
			<div id="copyright">&copy; iRead</div>
		</div>

	</div>
	<div id="credit">Designed by ZJN</div>
</body>
</html>
