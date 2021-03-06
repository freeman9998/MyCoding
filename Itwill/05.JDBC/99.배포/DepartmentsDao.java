package dept;



import java.util.List;
import java.util.Map;

/**
 * 
 * dept 테이블과 관련된 비즈니스 규약 메소드 선언
 *
 * @author  
 */
public interface DepartmentsDao {
	// 부서 등록
	public void insert(Department deparment) throws Exception;
	// 부서번호로 부서정보 반환
	public Department selectByNo(int deptno) throws Exception;
	// 부서 전체목록 반환
	public List selectByAll() throws Exception;
	// 사원정보(부서명포함) 전체목록 반환
	public List selectEmployees() throws Exception;
}






