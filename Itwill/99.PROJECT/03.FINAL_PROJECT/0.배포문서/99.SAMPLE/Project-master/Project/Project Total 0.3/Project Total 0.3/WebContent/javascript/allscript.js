/* slide script(mainpage.jsp) */
$(document)
		.ready(
				function() {

					// Custom settings
					var style_in = 'easeOutBounce';
					var style_out = 'jswing';
					var speed_in = 1000;
					var speed_out = 300;

					// Calculation for corners
					var neg = Math.round($('.qitem').width() / 2) * (-1);
					var pos = neg * (-1);
					var out = pos * 2;

					$('.qitem')
							.each(
									function() {

										url = $(this).find('a').attr('href');
										img = $(this).find('img').attr('src');
										alt = $(this).find('img').attr('img');

										$('img', this).remove();
										$(this)
												.append(
														'<div class="topLeft"></div><div class="topRight"></div><div class="bottomLeft"></div><div class="bottomRight"></div>');
										$(this).children('div').css(
												'background-image',
												'url(' + img + ')');

										$(this).find('div.topLeft').css({
											top : 0,
											left : 0,
											width : pos,
											height : pos
										});
										$(this).find('div.topRight').css({
											top : 0,
											left : pos,
											width : pos,
											height : pos
										});
										$(this).find('div.bottomLeft').css({
											bottom : 0,
											left : 0,
											width : pos,
											height : pos
										});
										$(this).find('div.bottomRight').css({
											bottom : 0,
											left : pos,
											width : pos,
											height : pos
										});

									}).hover(
									function() {

										$(this).find('div.topLeft').stop(false,
												true).animate({
											top : neg,
											left : neg
										}, {
											duration : speed_out,
											easing : style_out
										});
										$(this).find('div.topRight').stop(
												false, true).animate({
											top : neg,
											left : out
										}, {
											duration : speed_out,
											easing : style_out
										});
										$(this).find('div.bottomLeft').stop(
												false, true).animate({
											bottom : neg,
											left : neg
										}, {
											duration : speed_out,
											easing : style_out
										});
										$(this).find('div.bottomRight').stop(
												false, true).animate({
											bottom : neg,
											left : out
										}, {
											duration : speed_out,
											easing : style_out
										});

									},

									function() {

										$(this).find('div.topLeft').stop(false,
												true).animate({
											top : 0,
											left : 0
										}, {
											duration : speed_in,
											easing : style_in
										});
										$(this).find('div.topRight').stop(
												false, true).animate({
											top : 0,
											left : pos
										}, {
											duration : speed_in,
											easing : style_in
										});
										$(this).find('div.bottomLeft').stop(
												false, true).animate({
											bottom : 0,
											left : 0
										}, {
											duration : speed_in,
											easing : style_in
										});
										$(this).find('div.bottomRight').stop(
												false, true).animate({
											bottom : 0,
											left : pos
										}, {
											duration : speed_in,
											easing : style_in
										});

									}).click(
									function() {
										window.location = $(this).find('a')
												.attr('href');
									});
				});

/* datepicker (admin_concert_input.jsp) */
$(function() {
	var dates = $("#from, #to ")
			.datepicker(
					{
						minDate : '-0d+1',
						prevText : '?????? ???',
						nextText : '?????? ???',
						monthNames : [ '1???', '2???', '3???', '4???', '5???', '6???',
								'7???', '8???', '9???', '10???', '11???', '12???' ],
						monthNamesShort : [ '1???', '2???', '3???', '4???', '5???',
								'6???', '7???', '8???', '9???', '10???', '11???', '12???' ],
						dayNames : [ '???', '???', '???', '???', '???', '???', '???' ],
						dayNamesShort : [ '???', '???', '???', '???', '???', '???', '???' ],
						dayNamesMin : [ '???', '???', '???', '???', '???', '???', '???' ],
						dateFormat : 'yy-mm-dd',
						showMonthAfterYear : true,
						yearSuffix : '???',
						onSelect : function(selectedDate) {
							var option = this.id == "from" ? "minDate"
									: "maxDate", instance = $(this).data(
									"datepicker"), date = $.datepicker
									.parseDate(
											instance.settings.dateFormat
													|| $.datepicker._defaults.dateFormat,
											selectedDate, instance.settings);
							dates.not(this).datepicker("option", option,
									date);
						}
					});
});


/* picturetype check script(admin_concert_input.jsp) */
function UploadImg(fileObj) {
	$('#bg_sub').show();
	var filePath = fileObj.value;
	var fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
	var fileKind = fileName.split(".")[1];
	if (fileKind != "jpg" && fileKind != "JPG" && fileKind != "bmp"
			&& fileKind != "BMP" && fileKind != "gif" && fileKind != "GIF"
			&& fileKind != "png" && fileKind != "PNG") {
		alert("jpg, jpeg, gif, png ???????????? ?????? ????????? ????????? ???????????????.");
		document.getElementById("concertPicture").value = "";
		document.getElementById("concertPicture").select();
		document.selection.clear();
	}
}

/* jquery view script(admin_concert_input.jsp) */
$(function() {
	$(document).tooltip();
});