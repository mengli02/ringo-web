<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section id="widget-grid" class="">
	<!-- row -->
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-sortable" id="wid-id-0">
				<!-- widget options:
					usage: 
				<div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
					
					data-widget-colorbutton="false"	
					data-widget-editbutton="false"
					data-widget-togglebutton="false"
					data-widget-deletebutton="false"
					data-widget-fullscreenbutton="false"
					data-widget-custombutton="false"
					data-widget-collapsed="true" 
					data-widget-sortable="false"
					
				-->
				<header>
					<h2><strong>Default</strong> <i>Widget</i></h2>				
					
				</header>
				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->
						<input class="form-control" type="text">
						<span class="note"><i class="fa fa-check text-success"></i> Change title to update and save instantly!</span>
						
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body">
						
						<p> Widget comes with a default 10 padding to the body which can be removed by adding the class <code>.no-padding</code> 
							to the <code>.widget-body</code> class. The default widget also comes with 5 widget buttons as displayed on top right 
							corner of the widget header. </p>
						<a href="javascript:void(0);" class="btn btn-default btn-lg"> <strong>Big</strong> <i>Button</i> </a>
						
					</div>
					<!-- end widget content -->
					
				</div>
				<!-- end widget div -->
				
			</div>
		
		</article>
	
	</div>

</section>