package com.example.notiserver.port.in;

public interface ConditionNotiUseCase {
    //게시글에 댓글이 달리면 알림을 보낸다. -> 트리거
    //가입한지 일주일된 유저에게 리뷰달아달라는 알림 생성
    //게시글을 올린 뒤 10분 후 좋아요와 댓글의 개수를 알림으로 알려준다. -> 스케쥴링
    //매일 N시에 보내지는 정규알림 설정 -> 스케쥴링?
}
