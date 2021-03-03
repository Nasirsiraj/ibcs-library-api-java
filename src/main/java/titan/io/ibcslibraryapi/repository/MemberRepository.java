package titan.io.ibcslibraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import titan.io.ibcslibraryapi.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    public Member findByNid(int nid);
}
