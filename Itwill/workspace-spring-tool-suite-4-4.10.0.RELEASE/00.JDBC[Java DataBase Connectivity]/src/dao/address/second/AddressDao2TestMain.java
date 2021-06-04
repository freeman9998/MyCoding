package dao.address.second;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao2 addressDao2=new AddressDao2();
		System.out.println("-----------1.insert------------");
		//addressDao2.insert("xxx","장동건","565-9090","서울시민");
		//addressDao2.insert("uuu","고소영","676-9999","경기도민");
		System.out.println("-----------2.update-------------");
		addressDao2.updateByNo(10,"guard","흑우","236-8954","강원도민");
		addressDao2.updateByNo(12,"ffff","흑우없지!","895-4584","SPAIN");
		System.out.println("----------3.delete------------");
		addressDao2.deleteByNo(13);
		System.out.println("--------4.selectByNo-------------");
		addressDao2.selectByNo(30);
		addressDao2.selectByNo(33);
		System.out.println("---------5.selectAll------------");
		addressDao2.selectAll();
		

	}

}
