package co.kjm.securityPrj.member.map;

import java.util.List;

import co.kjm.securityPrj.member.vo.MemberVO;

public interface MemberMap {

	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	
}
