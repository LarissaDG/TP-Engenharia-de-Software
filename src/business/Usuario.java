package business;

public class Usuario {
	
		private String nome;
		private String email;
		private String estado;
		private String cidade;
		private int idDocumento;
		
		public String getNome() {
			return nome;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getEstado() {
			return estado;
		}
		
		public String getCidade() {
			return cidade;
		}
		
		public int getIdDocumento() {
			return idDocumento;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		
		public void setIdDocumento(int idDocumento) {
			this.idDocumento = idDocumento;
		}
		
		public Usuario(String nome, String email, String estado, String cidade, int idDocumento) {
			setNome(nome);
			setEmail(email);
			setEstado(estado);
			setCidade(cidade);
			setIdDocumento(idDocumento);
		}
		
}
