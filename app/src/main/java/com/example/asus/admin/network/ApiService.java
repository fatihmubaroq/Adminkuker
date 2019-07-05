package com.example.asus.admin.network;

import com.example.asus.admin.model.ResponseAdmin;
import com.example.asus.admin.model.ResponseBerita;
import com.example.asus.admin.model.ResponseInsert;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    //read
       @FormUrlEncoded
    @POST("read/login_admin.php")
       Call<ResponseAdmin> loginAdmin(@Field("email") String email, @Field("sandi") String sandi);

    @GET("read/berita.php")
    Call<ResponseBerita> getBerita();

    @Multipart
    @POST("create/berita.php")
    Call<ResponseInsert> insertBerta(@Part("judul") String judul,
                                     @Part MultipartBody.Part image,
                                     @Part("artikel") String artikel,
                                     @Part("tanggal") String tanggal);

    //update
    @FormUrlEncoded
    @POST("update/admin.php")
    Call<ResponseInsert> updateAdmin(@Field("id_admin") String id_admin, @Field("nama") String nama, @Field("sandi") String sandi,
                                     @Field("email") String email);

    //berita
    @Multipart
    @POST("update/berita.php")
    Call<ResponseInsert> updateBerita1(@Part("id") int id,
                                       @Part("judul") String judul,
                                       @Part MultipartBody.Part image,
                                       @Part("artikel") String artikel,
                                       @Part("hapus") String hapus,
                                       @Part("tanggal") String tanggal);

    @Multipart
    @POST("update/berita.php")
    Call<ResponseInsert> updateBerita2(@Part("id") int id,
                                       @Part("judul") String judul,
                                       @Part("artikel") String artikel,
                                       @Part("tanggal") String tanggal);

    //delete
    @FormUrlEncoded
    @POST("delete/delete.php")
    Call<ResponseInsert> delete(@Field("tabel") String tabel, @Field("cari") String cari, @Field("id_data") String idData);

}