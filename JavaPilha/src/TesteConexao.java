
public class TesteConexao {
	public static void main(String[] args) {
		
	//Codigo simplificado
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch (IllegalStateException ex) {
			System.out.println("Deu errado na conexao");}} 
		}
	
	//codigo tradicional

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("deu ruim");
//		}finally {
//			System.out.println("Finally");
//			if (con != null)
//			con.close();
//		}
//		
//	}
//}
