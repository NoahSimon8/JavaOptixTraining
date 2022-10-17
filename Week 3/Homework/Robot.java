public class Robot {
    
    private Shoot shoot;

    public Robot(){
        shoot = new Shoot(new Shooter());

    }

    public void telopInit(){
        shoot.initialize();
    }

    public void teleopPeriodic(){
        
    }
}

class Shoot{

    private Shooter shooter;

    public Shoot(Shooter shtr){
        shooter = shtr;
    }

    // sets up shooter
    public void initialize(){
        shooter.set_motor_speed(0);
        System.out.println("Shooter initialized");

    }
    // starts shooting
    public void execute(){
        shooter.set_motor_speed(1);
        System.out.println("Shooting");
    }

    // stops shooting
    public end(){
        shooter.stop();
        System.out.println("Shooter stopped");
    }



}



class Shooter{ 
    
    // initializes two motors of different ports
    private Motor motor_25 = new Motor(25);
    private Motor motor_26 = new Motor(26);

    // changes speed of both motors
    public void set_motor_speed(int speed){
        motor_25.set(speed);
        motor_26.set(speed);
    }

    // stops both motors
    public void stop(){
        motor_25.stop();
        motor_26.stop();
    }

}




class Motor {

    private int motor_speed;

    // Is this what it means by make a constructor for the port number?
    private int port_number;

    public Motor(int port_num){
        // sets the port number
        port_number = port_num;
    }

    public int get_port_number(){
        return port_number;
    }

    // to change motor speed
    public void set(int new_speed){
        motor_speed = new_speed;

    }
    // to return motor speed
    public int get(){
        return motor_speed;
    }
    // to stop the motor (speed = 0)
    public void stop(){
        motor_speed = 0;
    }
    
}

