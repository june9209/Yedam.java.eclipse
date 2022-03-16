package co.yedam.prj.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> selectMemberList();	//전체리스트 R
	MemberVO selectMember(MemberVO vo);	//한명분데이터 또는 로그인 처리 R
	int insertMember(MemberVO vo);		//등록 C
	int updateMember(MemberVO vo);		//수정 U
	int deleteMember(MemberVO vo);		//삭제 D
	
	boolean isIdCheck(String str); 		//아이디 중복체크 (is NN형식 존재하면 false, 존재하지않으면 true)  
										//is NN형식의 DEFAULT 값이 false
	
}
