package ecommerce.tutorial.jpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.internal.NotNull;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ecommerce.tutorial.enums.Gender;

@Entity
@Table(name = "profile")
public class ProfileEntity
{
    @Id
    private long id;

    @OneToOne
    @JoinColumn(nullable = false)
    @MapsId
    @JsonIgnore
    private SellerEntity seller;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String website;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String address;

    private String emailAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public ProfileEntity()
    {
    }

    public ProfileEntity(SellerEntity seller, String firstName, String lastName, Gender gender)
    {
        this.seller = seller;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public SellerEntity getSeller()
    {
        return seller;
    }

    public void setSeller(SellerEntity seller)
    {
        this.seller = seller;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
}
