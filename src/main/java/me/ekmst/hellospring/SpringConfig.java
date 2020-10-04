package me.ekmst.hellospring;

import me.ekmst.hellospring.repository.MemberRepository;
import me.ekmst.hellospring.repository.MemoryMemberRepository;
import me.ekmst.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
