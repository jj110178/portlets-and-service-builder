
<%
	/**
	 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
	 
%>

<%@include file="init.jsp"%>

<html>
<head>

</head>
<body>

	<div class="frame-container">
		<div class="frame-main">
			<div class="frame-block">
				Chart 1 [Static Line Chart]
				<div id="chart1" style="height: 300px; width: 470px;"></div>
			</div>
			<div class="frame-block">
				Chart 2 [Combination of Two Charts Line and Bar Chart(Dynamic Bar
				Chart)]
				<div id="chart2" style="height: 300px; width: 470px;"></div>
			</div>
			<div class="frame-block">
				Chart 3 [Dynamic bar Chart with Filter]
				<div id="chart3" style="height: 300px; width: 470px;"></div>


			</div>
			<div class="frame-block">
				GridView Should Be Here
				<table border="1" width="400px">
					<tr>
						<th>Agencies</th>
						<th>Data 1</th>
						<th>Data 2</th>
						<th>Data 3</th>
						<th>Data 4</th>
						<th>Data 5</th>
					</tr>
					<tr>
						<td>A</td>
						<td>100</td>
						<td>10</td>
						<td>40</td>
						<td>30</td>
						<td>30</td>
					</tr>
					<tr>
						<td>B</td>
						<td>200</td>
						<td>100</td>
						<td>40</td>
						<td>300</td>
						<td>130</td>
					</tr>
					<tr>
						<td>C</td>
						<td>20</td>
						<td>10</td>
						<td>40</td>
						<td>30</td>
						<td>30</td>
					</tr>
					<tr>
						<td>D</td>
						<td>70</td>
						<td>10</td>
						<td>20</td>
						<td>130</td>
						<td>30</td>
					</tr>
					<tr>
						<td>E</td>
						<td>10</td>
						<td>10</td>
						<td>10</td>
						<td>10</td>
						<td>10</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div id="myFilters">
		Filter By Agency: <select id="adsId">
			<option value="1">Agency A</option>
			<option value="2">Agency B</option>
			<option value="3">Agency C</option>
			<option value="4">Agency D</option>
			<option value="5">Agency E</option>
		</select>


		<div id="myOtherDatePicker"
			class="aui-datepicker-example aui-helper-clearfix">
			<span>Start Date</span><input type="text" size="30" id="myInput" />
		</div>
	</div>
</body>

<script>
	AUI().use('aui-datepicker', function(A) {
		new A.DatePicker({
			calendar : {
				dateFormat : '%m/%d/%Y',
				dates : [ '10/10/2013' ]
			},
			trigger : '#myInput'
		}).render('#myOtherDatePicker');
	});

	var plot3;
	var dynamicData;

	/*Initialize Graph*/

	jQuery(document).ready(function() {
		renderStaticgraph();

		renderGraph2(1);
		/*Initialize Dynamic Graph*/
		renderGraph(1);
		/* On Change of Filter Render the Graph Dynamically*/
		jQuery('#adsId').on('change', function() {
			// alert($(this).val());
			renderGraph($(this).val());
			renderGraph2($(this).val());
			
		});

		jQuery('#myInput').on('change', function() {
			alert($(this).val());

		});

	});

	function renderStaticgraph(){
		var cosPoints = [];
		for ( var i = 0; i < 2 * Math.PI; i += 0.1) {
			cosPoints.push([ i, Math.cos(i) ]);
		}
		var plot1 = $.jqplot('chart1', [ cosPoints ], {
			
			title : 'Line Chart Cosine',
			// Turns on animatino for all series in this plot.
			animate : true,
			// Will animate plot on calls to plot1.replot({resetAxes:true})
			animateReplot : true,
			cursor : {
				show : true,
				zoom : true,
				looseZoom : true,
				showTooltip : false
			},
			
			series : [ {
				showMarker : false
			} ],
			axes : {
				xaxis : {
					renderer:$.jqplot.CanvasAxisTickRenderer,
			          tickOptions:{
			            formatString:'%b&nbsp;%#d'
			          }, 
					label : 'Angle (radians)'
				},
				yaxis : {
					tickOptions:{
			            formatString:'$%.2f'
			            },
					label : 'Cosine'
				}
			},
			highlighter: {
		        show: true,
		        sizeAdjust: 7.5
		      },
		      cursor: {
		        show: false
		      }
		});
	}
	function renderGraph(adsId) {
		if (plot3) {
			$('#chart3').empty();
		}

		var baseurl = window.location.origin
				+ '/psmSB-portlet/api/jsonws/advertising/get-advertising-by-id';
		console.log(adsId);
		var restURL1 = baseurl + "?adsId=" + adsId;
		console.log(restURL1);

		jQuery.ajax({
			type : "GET",
			url : restURL1,
			dataType : "json",
			data : {},
			success : function(obj) {
				console.log(obj);

				dynamicData = [ [ 'Data1', obj.data1 ], [ 'Data2', obj.data2 ],
						[ 'Data3', obj.data3 ], [ 'Data4', obj.data4 ],
						[ 'Data5', obj.data5 ] ];
				plot3 = $('#chart3').jqplot([ dynamicData ], {
					title : 'Bar Chart with Varying Colors',
					// Turns on animatino for all series in this plot.
					animate : true,
					// Will animate plot on calls to plot1.replot({resetAxes:true})
					animateReplot : true,
					cursor : {
						show : true,
						zoom : true,
						looseZoom : true,
						showTooltip : true
					},
					seriesDefaults : {
						renderer : $.jqplot.BarRenderer,
						rendererOptions : {
							// Set the varyBarColor option to true to use different colors for each bar.
							// The default series colors are used.
							varyBarColor : true,
							// speed up the animation a little bit.
		                    // This is a number of milliseconds.
		                    // Default for a line series is 2500.
		                    animation: {
		                        speed: 2000
		                    }
						}
					},
					axesDefaults : {
						tickRenderer : $.jqplot.CanvasAxisTickRenderer,
						tickOptions : {
							angle : 0
						}
					},
					axes : {
						xaxis : {
							renderer : $.jqplot.CategoryAxisRenderer
						},
						x2axis : {
							renderer : $.jqplot.CategoryAxisRenderer
						},
						yaxis : {
							autoscale : true
						},
						y2axis : {
							autoscale : true
						}
					}
					
				});

			},
			error : function() {

			}
		});

	}

	function renderGraph2(id){
		Liferay.Service('/psmSB-portlet#advertising/get-advertising-by-id', {
			adsId : id
		}, function(obj) {
			console.log(obj);
			console.log(obj.data1);
			var line1 = [ [ 'Data1', obj.data1 ], [ 'Data2', obj.data2 ],
							[ 'Data3', obj.data3 ], [ 'Data4', obj.data4 ],
							[ 'Data5', obj.data5 ] ];
			var line2 = [ [ 'Day 1', 28 ], [ 'Day 2', 13 ], [ 'Day 3', 54 ],
					[ 'Day 4', 47 ], [ 'Day 5', 16 ] ];
			console.log([ line1 ]);
			console.log([ line2 ]);

			var plot2 = $.jqplot('chart2', [ line1, line2 ], {
				title : 'Bar Chart with Line Chart',
				// Turns on animation for all series in this plot.
				animate : true,
				// Will animate plot on calls to plot1.replot({resetAxes:true})
				animateReplot : true,
				cursor : {
					show : true,
					zoom : true,
					looseZoom : true,
					showTooltip : true
				},
				series : [ {
					renderer : $.jqplot.BarRenderer
				}, {
					xaxis : 'x2axis',
					yaxis : 'y2axis'
				} ],
				legend : {
					show : true,
					placement : 'outsideGrid'
				},
				axesDefaults : {
					tickRenderer : $.jqplot.CanvasAxisTickRenderer,
					tickOptions : {
						angle : 30
					}
				},
				axes : {
					xaxis : {
						renderer : $.jqplot.CategoryAxisRenderer
					},
					x2axis : {
						renderer : $.jqplot.CategoryAxisRenderer
					},
					yaxis : {
						autoscale : true
					},
					y2axis : {
						autoscale : true
					}
				}
			});
		});
	}

	/** YUI **/
</script>
</html>
