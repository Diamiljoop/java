import java.awt.Point;
public class Robot{
  // declaration des atrributs
  String nom;
  private Point position;
  int vitesse;
  
  // declaration des constructeurs
  public Robot(String MonRobot){
  nom=MonRobot;
  position=new Point (0,0);
  vitesse=0;
  }
  // declaration des constructeurs
  public Robot(String MonRobot ,int x, int y, int vitesse) {
    nom=MonRobot;
    position=new Point (x,y);
    this.vitesse=vitesse;
  }
  
  public void allerALest(){
      position.translate(vitesse,0);
  }
  public void allerALOuest(){
      position.translate(-vitesse,0);
  }
  public void allerAuNord(){
      position.translate(0,vitesse);
  }
  public void allerAuSudt(){
      position.translate(0,-vitesse);
  }
  public void accerler(){
    if(vitesse<10)
      vitesse++;
  }
  public void decelerer(){
  vitesse--;
    if(vitesse==0){
      stop();
  }
  }
  public void stop(){
  vitesse=0;
  }
  public Point getPosition(){
  return position;  
  }
  public void sePresenter(){
  System.out.println("nom: " + nom + "position" +position);
  }

  int niveauCombustible;
  int n;
 /* public Robot(){
    this.robot1=Robot1;
  }*/
  public void setNiveau(){
    niveauCombustible=n;
  }
  public void getNiveau(){
    if(n==0){
      stop();
      sePresenter();
    }
    else{
      niveauCombustible=n;
      sePresenter();
    }
  }
  public void sePromener(){
    double mouv=Math.random ();
    if(mouv==0){
      decelerer();
    }
    else{
      decelerer();
    }

  }

  
}
