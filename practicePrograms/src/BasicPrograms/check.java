package BasicPrograms;

public class check {
public static void main(String[] args) {
	Predicate<int> getbool=delegate(int val)
			{
		if(val<=0)
			return false;
			}
	else
		return true;
};
Console.Write(getbool(-1));
}

}
