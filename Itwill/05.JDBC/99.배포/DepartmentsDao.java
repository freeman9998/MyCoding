package dept;



import java.util.List;
import java.util.Map;

/**
 * 
 * dept ���̺�� ���õ� ����Ͻ� �Ծ� �޼ҵ� ����
 *
 * @author  
 */
public interface DepartmentsDao {
	// �μ� ���
	public void insert(Department deparment) throws Exception;
	// �μ���ȣ�� �μ����� ��ȯ
	public Department selectByNo(int deptno) throws Exception;
	// �μ� ��ü��� ��ȯ
	public List selectByAll() throws Exception;
	// �������(�μ�������) ��ü��� ��ȯ
	public List selectEmployees() throws Exception;
}






