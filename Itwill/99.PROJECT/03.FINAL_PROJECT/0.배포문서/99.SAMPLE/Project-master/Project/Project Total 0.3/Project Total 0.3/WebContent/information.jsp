<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공연정보</title>
<link
	href="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/css/bootstrap.css"
	rel="stylesheet">
<link href="stylesheets/Mainpage_Layout.css" rel="stylesheet"
	type="text/css">
<link href="stylesheets/concert/information.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
<script
	src="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/js/bootstrap.js"></script>
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>

<script>
	$(function() {
		$("#information").tabs();
	});

	$(function() {
		for ( var i = 1; i <= 10; i++) {
			(function() {
				var id = i;
				$("button.1_" + id).click(function() { /* button.1 class = show */
					$("div." + id).show("slow");
				});
				$("button.2_" + id).click(function() { /* button.2 class = hide */
					$("div." + id).hide(5000);
				});
			})();
		}
	});
</script>
</head>

<body>

	<div id="wrap">
		<jsp:include page="share/header.jsp"></jsp:include>

		<!--전체 크기 -->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<ul class="nav">
						<li class="active"><a href="ConcertManageController?action=index">공연</a></li>
						<li><a href="ReservationManageController?action=index">예약 </a></li>
						<li><a href="ReviewManageController?action=index">리뷰</a></li>
						<li><a href="membership.jsp">멤버십</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="content">
			<!-- 실직적으로 보여질 정보들-->

			<div class="section_1">
				<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
				<div class="section_1_left" id="performance">
					<!-- 공연사진,평점,리뷰 바로가기-->
					<img src="images/photo.jpg" alt="기막힌스캔들">
				</div>
				<div class="section_1_right" id="story">
					<!-- 줄거리-->
					<p class="title">
						<b> 공연명 : 기막힌스캔들 </b>
					</p>
					<p class="schedule">공연일정 : 2012년 1월 14일 ~ OPEN RUN</p>
					<p class="grade">관람등급 : 13세 관람가</p>
					<p>출연 : 우진 역(김창호, 이종석, 이준영), 고은역(김두희, 김지혜, 김자영), ...</p>
					<div>
						줄거리 :
						<button class='1_1'>보기</button>
						<button class='2_1'>숨기기</button>
					</div>
					<div class="1" style="display: none">아내를 친정에 보내고 모델 애인과 기막힌
						파티를 준비하는 양평펜션의 주인 우진. 오.마.이.갓! 그러나 아내는 친정 나들이를 취소한다!! 아내 몰래 바람피우는
						남편, 남편의 친구와 사랑에 빠진 아내, 죽마고우의 부인과 사랑에 빠진 친구, 명품과 사랑에 빠진 남편의 애인, 그리고
						돈이라면 무엇이든 다 하는 요리사까지..!! 잠시도 눈을 뗼 수 없는 다섯 남녀의 기막힌 스캔들 현장. 스캔들을
						훔쳐보는 재미 아시죠? 이제 대놓고 훔쳐보세요!</div>
				</div>
			</div>
			<div class="section_1">
				<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
				<div class="section_1_left" id="performance">
					<!-- 공연사진,평점,리뷰 바로가기-->
					<img src="images/photo2.jpg" alt="러브액츄얼리">
				</div>
				<div class="section_1_right" id="story">
					<!-- 줄거리-->
					<p class="title">
						<b> 공연명 : 러브액츄얼리 </b>
					</p>
					<p class="schedule">공연일정 : 2012년 5월 4일 ~ OPEN RUN</p>
					<p class="grade">관람등급 : 만9세 관람가</p>
					<p>출연 : 이순원, 육소영, 윤홍규, 양유진, 장용석, 이은주, ...</p>
					<div>
						줄거리 :
						<button class='1_2'>보기</button>
						<button class='2_2'>숨기기</button>
					</div>
					<div class='2' style="display: none">100일 커플, 이제 사랑을 막 시작한
						풋풋함이 느껴지는 커플. 아직은 함께한 시간이 많지는 않지만, 철민은 다슬에게 변치 않는 마음과 영원한 사랑을
						약속한다. 다슬도 그런 철민이 너무 좋고, 마냥 설렌다. 다슬은 100일을 맞아 부모님께 사랑하는 남자친구를 소개
						시켜주려고 하는데... 사랑을 하면서 가장 설레고, 두근거리는 시기인 100일. 그들이 말하는 ‘사랑’의 무게는
						어떨까? 1000일 커플, 연애 3년 차인 이 커플은 슬슬 권태기에 접어든다. 미진은 사소한 것에서 꼬투리를 잡으며,
						이 모든 것은 영민이 자신에게 마음이 멀어졌기 때문이라 생각해서 온갖 짜증을 부린다. 영민은 이런 미진이 이해가 가지
						않는다. 권태기인 커플의 반복되는 싸움과 화해. 이 속에서 그들은 진짜 사랑을 찾을 수 있을까? 10년 커플, 다른
						사람들은 이 커플을 보고 연인이기 보다는 부부 혹은 친구라 부른다. 그대들의 사랑은 사랑이 아닌 우정이라고. 용석의
						기타 치는 모습을 보고 반한 은진. 그러나 10년 째, 기타만 치고 있는 용석. 이런 용석이 답답한 은진은 용석에게
						결혼을 재촉한다. 그러나 용석은 사람 좋은 웃음으로 그 상황만을 모면하려고 하는데... 사랑 혹은 우정. 그리고 이상과
						현실 사이에 서 있는 이들의 이야기. 10년 동안 지켜 온 그들의 사랑을 끝까지 지켜 낼 수 있을까?</div>
				</div>
			</div>

			<div class="section_1">
				<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
				<div class="section_1_left" id="performance">
					<!-- 공연사진,평점,리뷰 바로가기-->
					<img src="images/photo3.jpg" alt="기막힌스캔들">
				</div>
				<div class="section_1_right" id="story">
					<!-- 줄거리-->
					<p class="title">
						<b> 공연명 : 삼봉이발소 </b>
					</p>
					<p class="schedule">공연일정 : 2012년 5월 2일 ~ OPEN RUN</p>
					<p class="grade">관람등급 : 만7세 관람가</p>
					<p>출연 : 양동선, 김영확, 류단, 박상현, 김상훈, 김나래, 송재연...</p>
					<div>
						줄거리 :
						<button class='1_3'>보기</button>
						<button class='2_3'>숨기기</button>
					</div>
					<div class="3" style="display: none">＂너무 불공평해. 태어날 때부터 인생의 반이
						결정되어 있잖아!” 모두가 공감하고 이해하지만 인정하고 싶지 않고 불편했던 진실‘외모지상주의’ 외모 바이러스? 말하는
						고양이? 다소 황당한 설정으로 무거운 소재를 유쾌하게 풀었다! 장미는 못 생겨서 예쁜 짝과 항상 비교당해야 한다. 이
						때문에 큰 스트레스를 받던 장미는 어느 날 외모에 심각한 콤플렉스를 가진 사람들이 충격적인 이야기를 듣거나 자괴감에
						빠져 시름시름 앓다가 작을 일으키는 ‘외모 바이러스’라는 병이 퍼진다는 소식을 듣고 두려움에 휩싸인다. 그 때 TV에서
						신비한 꽃미남 이발사 삼봉이가 커다란 가위를 들고 그들을 치료하러 다니는 모습을 보고, 삼봉이발소에서 아르바이트를
						자원하는데…</div>
				</div>
			</div>
			<center>
				<div>
					<button class='1_4'>더보기</button>
					<button class='2_4'>숨기기</button>
				</div>
			</center>
			<div class="4" style="display: none">
				<div class="section_1">
					<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
					<div class="section_1_left" id="performance">
						<!-- 공연사진,평점,리뷰 바로가기-->
						<img src="images/photo.jpg" alt="기막힌스캔들">
					</div>
					<div class="section_1_right" id="story">
						<!-- 줄거리-->
						<p class="title">
							<b> 공연명 : 기막힌스캔들 </b>
						</p>
						<p class="schedule">공연일정 : 2012년 1월 14일 ~ OPEN RUN</p>
						<p class="grade">관람등급 : 13세 관람가</p>
						<p>출연 : 우진 역(김창호, 이종석, 이준영), 고은역(김두희, 김지혜, 김자영), ...</p>
						<div>
							줄거리 :
							<button class='1_5'>보기</button>
							<button class='2_5'>숨기기</button>
						</div>
						<div class="5" style="display: none">아내를 친정에 보내고 모델 애인과 기막힌
							파티를 준비하는 양평펜션의 주인 우진. 오.마.이.갓! 그러나 아내는 친정 나들이를 취소한다!! 아내 몰래 바람피우는
							남편, 남편의 친구와 사랑에 빠진 아내, 죽마고우의 부인과 사랑에 빠진 친구, 명품과 사랑에 빠진 남편의 애인,
							그리고 돈이라면 무엇이든 다 하는 요리사까지..!! 잠시도 눈을 뗼 수 없는 다섯 남녀의 기막힌 스캔들 현장.
							스캔들을 훔쳐보는 재미 아시죠? 이제 대놓고 훔쳐보세요!</div>
					</div>
				</div>

			</div>
			<div class="4" style="display: none">
				<div class="section_1">
					<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
					<div class="section_1_left" id="performance">
						<!-- 공연사진,평점,리뷰 바로가기-->
						<img src="images/photo.jpg" alt="기막힌스캔들">
					</div>
					<div class="section_1_right" id="story">
						<!-- 줄거리-->
						<p class="title">
							<b> 공연명 : 기막힌스캔들 </b>
						</p>
						<p class="schedule">공연일정 : 2012년 1월 14일 ~ OPEN RUN</p>
						<p class="grade">관람등급 : 13세 관람가</p>
						<p>출연 : 우진 역(김창호, 이종석, 이준영), 고은역(김두희, 김지혜, 김자영), ...</p>
						<div>
							줄거리 :
							<button class='1_6'>보기</button>
							<button class='2_6'>숨기기</button>
						</div>
						<div class="6" style="display: none">아내를 친정에 보내고 모델 애인과 기막힌
							파티를 준비하는 양평펜션의 주인 우진. 오.마.이.갓! 그러나 아내는 친정 나들이를 취소한다!! 아내 몰래 바람피우는
							남편, 남편의 친구와 사랑에 빠진 아내, 죽마고우의 부인과 사랑에 빠진 친구, 명품과 사랑에 빠진 남편의 애인,
							그리고 돈이라면 무엇이든 다 하는 요리사까지..!! 잠시도 눈을 뗼 수 없는 다섯 남녀의 기막힌 스캔들 현장.
							스캔들을 훔쳐보는 재미 아시죠? 이제 대놓고 훔쳐보세요!</div>
					</div>
				</div>
			<div class="section_1">
				<!-- 공연사진,평점,리뷰 바로가기, 줄거리-->
				<div class="section_1_left" id="performance">
					<!-- 공연사진,평점,리뷰 바로가기-->
					<img src="images/photo3.jpg" alt="기막힌스캔들">
				</div>
				<div class="section_1_right" id="story">
					<!-- 줄거리-->
					<p class="title">
						<b> 공연명 : 삼봉이발소 </b>
					</p>
					<p class="schedule">공연일정 : 2012년 5월 2일 ~ OPEN RUN</p>
					<p class="grade">관람등급 : 만7세 관람가</p>
					<p>출연 : 양동선, 김영확, 류단, 박상현, 김상훈, 김나래, 송재연...</p>
					<div>
						줄거리 :
						<button class='1_7'>보기</button>
						<button class='2_7'>숨기기</button>
					</div>
					<div class="7" style="display: none">＂너무 불공평해. 태어날 때부터 인생의 반이
						결정되어 있잖아!” 모두가 공감하고 이해하지만 인정하고 싶지 않고 불편했던 진실‘외모지상주의’ 외모 바이러스? 말하는
						고양이? 다소 황당한 설정으로 무거운 소재를 유쾌하게 풀었다! 장미는 못 생겨서 예쁜 짝과 항상 비교당해야 한다. 이
						때문에 큰 스트레스를 받던 장미는 어느 날 외모에 심각한 콤플렉스를 가진 사람들이 충격적인 이야기를 듣거나 자괴감에
						빠져 시름시름 앓다가 작을 일으키는 ‘외모 바이러스’라는 병이 퍼진다는 소식을 듣고 두려움에 휩싸인다. 그 때 TV에서
						신비한 꽃미남 이발사 삼봉이가 커다란 가위를 들고 그들을 치료하러 다니는 모습을 보고, 삼봉이발소에서 아르바이트를
						자원하는데…</div>
				</div>
			</div>

			</div>

		</div>

		<jsp:include page="share/footer.jsp"></jsp:include>
	</div>
</body>
</html>