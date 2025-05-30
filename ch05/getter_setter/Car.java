package ch05.getter_setter;

public class Car {
	// 개인적인 필드
	private int speed;
	private boolean stop;

	// 공용메서드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		} // speed 입력값이 음수면 0으로 입력
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}// stop값이 true이면 스톱을 진행하고 스피드 0으로 조절

}
