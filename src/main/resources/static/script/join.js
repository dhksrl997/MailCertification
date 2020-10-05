$(function() {
	var isCertification=false;
	
	$(".sendMail").click(function() {// 메일 입력 유효성 검사
		var mail = $(".mail").val(); //사용자의 이메일 입력값. 
		
		if (mail == "") {
			alert("메일 주소가 입력되지 않았습니다.");
		} else {
			mail = mail+"@"+$(".domain").val(); //셀렉트 박스에 @뒤 값들을 더함.
			$.ajax({
				type : 'post',
				url : '/CheckMail',
				data : {
					mail:mail
					},
				dataType :'json',
			});
			alert("이메일을 확인하시기 바랍니다.")
			console.log(mail);
			isCertification=true;
		}
	});
	//
});