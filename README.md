### PENJELASAN HASIL IMPLEMENTASI DARI INPUT CONTROL PHONE NUMBER DAN ALERT
----
Langkah Pembuatan Project

Buat Project Baru
Di Android Studio, pilih New Project > Empty Activity. Beri nama project kamu (misalnya "KamalApp").

Struktur File Utama

    MainActivity.kt: File Kotlin utama yang menangani interaksi pengguna.

    activity_main.xml: File layout yang mengatur tampilan UI.

 Penjelasan Komponen:

### 1. activity_main.xml (Desain UI)

File ini mendefinisikan tampilan antarmuka pengguna, terdiri dari:

EditText → Input untuk nomor HP.
inputType="phone". Dengan adanya ini, maka nanti saat menginputkan nomor hp, hanya tersedia tampilan angka saja untuk diinputkan.

Button → tombol untuk:

    Menampilkan alert dialog (btnconfirm)

Semua komponen ini ditempatkan dalam LinearLayout 


### 2. MainActivity.kt (Logika Aplikasi)

File ini berisi logika yang mengatur interaksi pengguna:

### private lateinit var etPhone dan btnConfirm:

Mendeklarasikan dua variabel yang merepresentasikan input nomor telepon (EditText) dan tombol konfirmasi (Button). lateinit digunakan karena nilainya akan diberikan nanti di onCreate().

### onCreate():

Fungsi ini dipanggil saat activity pertama kali dibuat. Di sini dilakukan inisialisasi view dan pemberian aksi pada tombol.

#### findViewById(R.id.et_phone_number):

Menghubungkan variabel etPhone dengan komponen EditText di layout XML.

### AlertDialog.Builder(this) : 

Membuat dialog pop-up yang bisa ditampilkan ke user.

### .setTitle("Konfirmasi"): 

Judul dari pop-up dialog.

### .setMessage(...): 

Isi pesan dari dialog yang memberi tahu atau meminta persetujuan user.

### .setPositiveButton("Yes") { _, _ -> ... }: 

Tombol "Yes" untuk menerima konfirmasi. Di dalam {} bisa diisi logika lanjutan seperti menyimpan data, menampilkan pesan sukses, dsb.

### .setNegativeButton("No", null): 

Tombol "No" yang hanya menutup dialog tanpa aksi tambahan.

### .show(): 

Menampilkan dialog ke layar.

## Kesimpulan

Aplikasi ini menampilkan antarmuka untuk menginput nomor telepon dan menampilkan alert konfirmasi ketika tombol ditekan. Fitur ini penting dalam user experience untuk memastikan input sudah benar sebelum diproses lebih lanjut.
