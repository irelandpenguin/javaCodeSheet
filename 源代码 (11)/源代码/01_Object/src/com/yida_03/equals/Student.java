package com.yida_03.equals;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	


	/*
	//�ֹ���дequals()����
	@Override
	public boolean equals(Object obj) {
		//����Ҫ�Ľ�����������Ƚϵĳ�Ա��������������true����false
		//������ʵҪ�Ƚϵľ���name��age
		//���ǣ�name��String���͵ģ���String���������͵ģ����ԣ������ﲻ��ֱ����==�Ƚϣ�Ӧ����equals()�Ƚ�
		//String��equals()��������дObject��ģ��Ƚϵ����ַ����������Ƿ���ͬ��������ȼ�ס��
		Student s = (Student)obj;
		return (s.age == this.age && s.name.equals(this.name));
	}*/
}
