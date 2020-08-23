class Calculator {
	public double calc(double ratio) {
		return Math.PI * Math.pow(ratio, 2);
	}

	public double calc(int base, int height) {
		return base * height;
	}

	public double calc(double base, double height) {
		return (base * height) / 2;
	}
}