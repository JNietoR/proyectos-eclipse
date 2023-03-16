package PaqueteSuperHeroe;

public class SuperHeroe {

		private String nombre;
		private String descripcion;
		private Boolean capa;
		
		public SuperHeroe() {
			this.nombre="";
			this.descripcion="";
			this.capa=false;
		}
		
		public SuperHeroe(String nombre) {
			this.nombre=nombre;
			this.descripcion="";
			this.capa=false;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Boolean getCapa() {
			return capa;
		}

		public void setCapa(Boolean capa) {
			this.capa = capa;
		}
		
		public String toString() {
			String tienecapa="";
			if(this.capa) {
				tienecapa= "Tiene capa";
			}else {
				tienecapa="No tiene capa";
			}
			return "Nombre"+this.nombre+", "+tienecapa+" descripcion: "+this.descripcion+"";
		}
		
}
