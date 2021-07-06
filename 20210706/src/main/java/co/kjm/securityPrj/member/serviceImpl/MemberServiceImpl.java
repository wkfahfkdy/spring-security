package co.kjm.securityPrj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kjm.securityPrj.member.map.MemberMap;
import co.kjm.securityPrj.member.service.MemberService;
import co.kjm.securityPrj.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMap map;
	
	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		return map.memberLogin(vo);
	}

}
