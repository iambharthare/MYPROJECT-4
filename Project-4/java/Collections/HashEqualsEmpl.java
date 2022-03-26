package in.co.rays.Collections;

public class HashEqualsEmpl {
	int id;

	public HashEqualsEmpl(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		HashEqualsEmpl hem = (HashEqualsEmpl) obj;
		if (id != hem.id) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = prime * result + id;
		return result;
	}

}
