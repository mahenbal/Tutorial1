public class Mahasiswa {
	private String angkatan;
	private String gender;
	private String umur;
	private String nama;

	public Mahasiswa(String nama, String umur, String gender, String angkatan) {
		this.angkatan = angkatan;
		this.nama = nama;
		this.gender = gender;
		this.umur = umur;
	}

	public String getMahasiswa() {
		return nama;
	}

	public void setMahasiswa(String nama) {
		this.nama = nama;
	}
	
	public void changeName(String updatedNama) {
		this.nama = updatedNama;
	}
	
}
