/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yanaf
 */
public class User 
{//declarer les champs
    private int id;
    private String prenom;
    private String nom;
    private String login;
    private String password;
    private String profile;
 
 //constructeur sans argument
    public User(){}
    
 //constructeur avec tous les champs comme argument
    public User(int id,String prenom,String nom,String login,String password,String profile)
    {
        this.id=id;
        this.prenom=prenom;
        this.nom=nom;
        this.login=login;
        this.password=password;
        this.profile=profile;
    }
    
 //methode getter de tous les champs
    public int getid()
            {return id;}
    public String getprenom()
            {return prenom;}
    public String getnom()
            {return nom;}
    public String getlogin()
            {return login;}
    public String getpassword()
            {return password;}
    public String getprofile()
            {return profile;}
    
 //methode setter de tous les champs
   public void  Setid(int id)
            {id=id;}
   public void Setprenom(String prenom)
            {prenom=prenom;}
   public void Setnom(String nom)
            {nom=nom;}
   public void Setlogin(String login)
            {login=login;}
   public void Setpassword(String password)
            {password=password;}
   public void SetPreofile(String profile)
            {profile=profile;}
           
 }
    
       
    
  
   

