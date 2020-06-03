package Crowd_Pressure_AGH.model.person;

import Crowd_Pressure_AGH.DefaultConfig;

/** The class containing constant values of person Simulation properties */
public class StaticInfo {
	private int id;
	private double mass; // [kg]
	private double radius; // [m]
	private double comfortableSpeed; // [m/sec]
	private double visionAngle; // [degrees]
	private double horizontDistance; // [m]
	private double relaxationTime; // [sec]

	public StaticInfo(int id, double mass, double comfortableSpeed, double visionAngle, double horizontDistance,
					  double relaxationTime) {
		super();
		this.id = id;
		this.mass = mass;
		this.radius = mass / DefaultConfig.MASS_RADIUS_RATIO;
		this.comfortableSpeed = comfortableSpeed;
		this.visionAngle = visionAngle;
		this.horizontDistance = horizontDistance;
		this.relaxationTime = relaxationTime;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
		this.radius = mass / DefaultConfig.MASS_RADIUS_RATIO;
	}

	public double getRadius() {
		return radius;
	}

	public double getComfortableSpeed() {
		return comfortableSpeed;
	}

	public void setComfortableSpeed(double comfortableSpeed) {
		this.comfortableSpeed = comfortableSpeed;
	}

	public double getVisionAngle() {
		return visionAngle;
	}

	public void setVisionAngle(double visionAngle) {
		this.visionAngle = visionAngle;
	}

	public double getHorizontDistance() {
		return horizontDistance;
	}

	public void setHorizontDistance(double horizontDistance) {
		this.horizontDistance = horizontDistance;
	}

	public double getRelaxationTime() {
		return relaxationTime;
	}

	public void setRelaxationTime(double relaxationTime) {
		this.relaxationTime = relaxationTime;
	}

	public int getId() {
		return id;
	}

}
