<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html lang="ko">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
   <title>View Test Page</title> 
</head> 
 <body> 
     <h2>설정 테스트 ${name}</h2> 
     <div>JSP 뿌리기</div> 
     <c:forEach var="item" items="${list}" varStatus="idx"> 
         ${idx.index} : ${item} <br/> 
     </c:forEach>    
</body> 
<!-- 

 < c : forEach > 설명
settingTest.java에서 모델앤뷰로 list라는 이름의 name값에 List<String> resultList을 받아와서 $ {list}에 넣어줌
이 데이터를 var="item"에서 변수 item으로 지정함

varStatus="idx"는 for문의 i 같은 인덱스 번호 역할. i는 컬렉션(여기서는 list)의 길이 수만큼 자동(따로 설정가능 : begin, end, step)
$ {idx.index}에서 .index는  0부터 시작하라는 forEach의 varStatus 명령어(1부터 시작은 .count)
즉, 실질적으로 varStatus=0
그래서 첫번째 출력값은 0 : Hello World

  -->
</html>