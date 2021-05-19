package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // private final MemberRepository memberRepository = new MemoryMemberRepository();
        // 인터페이스만 불러오면 null exception
            // 구현 객체 선택해줘야.
    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
        // 생성자 주입 --> 의존관계 주입

    public void join(Member member) {
        memberRepository.save(member);
    }
        // 다형성에 의해 인터페이스가 아니라 구현체에 있는 save 를 호출.

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}