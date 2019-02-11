package webservices.rest_auth.signup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ir.sharif.divarmehrabani.webservices.base.BaseResponse;

import java.util.List;

public class SignupResponse extends BaseResponse {
    @Expose @SerializedName("age")
    private int age;

    @Expose @SerializedName("city")
    private String city;

    @Expose @SerializedName("district")
    private int district;

    @Expose @SerializedName("gender")
    private String gender;

    @Expose @SerializedName("interests")
    private String interests;

    @Expose @SerializedName("name")
    private String name;

    @Expose @SerializedName("phone")
    private String phone;

    @Expose @SerializedName("professions")
    private List<String> professions;

    @Expose @SerializedName("province")
    private String province;

    public SignupResponse(int age, String city, int district, String gender, String interests, String name, String phone, List<String> professions, String province) {
        this.age = age;
        this.city = city;
        this.district = district;
        this.gender = gender;
        this.interests = interests;
        this.name = name;
        this.phone = phone;
        this.professions = professions;
        this.province = province;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public int getDistrict() {
        return district;
    }

    public String getGender() {
        return gender;
    }

    public String getInterests() {
        return interests;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public String getProvince() {
        return province;
    }
}
