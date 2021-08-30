import scala.math.sqrt
import scala.math.pow

object myApp extends App {
  val p1=Point(1,2)
  val p2=Point(2,3)
  
  println(p1.add(p2))
  
  println("===============")
  
  println(p1)
  println(p1.move(1,1))
  
  println("===============")
  
  println(p1.distance(p2))
  
  println("===============")
  
  println(p1.invert())
  
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
 // Question 1 
 def add(that:Point)=Point(this.x+that.x,this.y+that.y)
 
 //Question 2
 def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
 
 //Question 3
 def distance(that:Point):Double=sqrt(pow(that.x-this.x,2)+pow(that.y-this.y,2))
   
 //Question 4
 def invert()=Point(this.y,this.x)
  
}