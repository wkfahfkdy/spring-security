package co.kjm.securityPrj.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kjm.securityPrj.member.service.MemberService;
import co.kjm.securityPrj.member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberDao;
	
	@RequestMapping("memberLoginForm.do")
	public String memberLoginForm(Model model, MemberVO vo) {
		
		model.addAttribute("memberVO", vo);
		
		return "member/memberLoginForm";
	}
	
	@RequestMapping("memberLogin.do")
	public String memberLogin(MemberVO vo) {
		
		memberDao.memberLogin(vo);
		
		return "member/main";
	}
	
}
