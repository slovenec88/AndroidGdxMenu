package edu.gricar.RVMenu;

import com.badlogic.gdx.math.MathUtils;

public class CameraPosition {
	public static final float ANGLE_DEG = new Float(1.2);

	private float posX, posY, posZ;
	private float step;

	public CameraPosition() {
		setPosX(new Float(0));
		setPosY(new Float(0));
		setPosZ(new Float(1.5));

		setStep(new Float(0.08));
	}

	public void moveDown() {
		setPosY(getPosY() - getStep());
	}

	public void moveUp() {
		setPosY(getPosY() + getStep());
	}

	public void moveLeft() {
		rotate(2*ANGLE_DEG);
	}

	public void moveRight() {
		rotate(-(4*ANGLE_DEG));
	}

	public void moveBackward() {
		if(getPosX() < 0) {
			if(getPosZ() < 0) {
				setPosZ(getPosZ() - getStep());
			}
			else {
				setPosZ(getPosZ() + getStep());				
			}
			setPosX(getPosX() - getStep());
		}
		else {
			if(getPosZ() < 0) {
				setPosZ(getPosZ() - getStep());
			}
			else {
				setPosZ(getPosZ() + getStep());
			}
			setPosX(getPosX() + getStep());
		}
	}

	public void moveForward() {
		if(getPosX() > 0) {
			if(getPosZ() > 0) {
				setPosZ(getPosZ() - getStep());
			}
			else {
				setPosZ(getPosZ() + getStep());				
			}
			setPosX(getPosX() - getStep());
		}
		else {
			if(getPosZ() > 0) {
				setPosZ(getPosZ() - getStep());
			}
			else {
				setPosZ(getPosZ() + getStep());
			}
			setPosX(getPosX() + getStep());
		}
	}

	public void rotate() {
		rotate(ANGLE_DEG);
	}

	private void rotate(float angleDeg) {
		float cos = MathUtils.cosDeg(angleDeg);
		float sin = MathUtils.sinDeg(angleDeg);
		float x = getPosX();
		float z = getPosZ();

		setPosX(cos*x - sin*z);
		setPosZ(sin*x + cos*z);
	}

	public float getPosX() {
		return posX;
	}

	public float getPosY() {
		return posY;
	}

	public float getPosZ() {
		return posZ;
	}

	public float getStep() {
		return step;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public void setPosZ(float posZ) {
		this.posZ = posZ;
	}

	public void setStep(float step) {
		this.step = step;
	}
}