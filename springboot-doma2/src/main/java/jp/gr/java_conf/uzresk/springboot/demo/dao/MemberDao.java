package jp.gr.java_conf.uzresk.springboot.demo.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import jp.gr.java_conf.uzresk.springboot.demo.entity.Member;

@Dao
@ConfigAutowireable
public interface MemberDao {

	@Select
	Optional<Member> selectByUserId(String userId);

	@Select
	Optional<Member> selectByUserId(String userId, SelectOptions options);

	@Select
	List<Member> selectAll();

	@Insert
	int insert(Member member);

	@Update
	int update(Member member);

	@Delete
	int delete(Member member);

}
