public class Dosen{
	private String pekerjaan;
	private String jabatan;
	private String umur;
	private String nama;
	private String gender;
	
	public Dosen(String pekerjaan, String jabatan, String nama, String umur, String gender) {
		this.pekerjaan = pekerjaan;
		this.nama = nama;
		this.gender = gender;
		this.umur = umur;
		this.jabatan = jabatan;
	}

	public String getDosen() {
		return nama;
	}

	public void setDosen(String nama) {
		this.nama = nama;
	}
	
	public void changeName(String updatedNama) {
		this.nama = updatedNama;
	}


}
