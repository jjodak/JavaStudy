package Ch02.Sec01;

public class VariableScopeExample
{
	public static void main(String[] args)
	{
		int v1 = 15;
		if(v1>10)
		{
			int v2 = v1 -10;
			//v1 은 여기서도 사용 가능
		}
		//int v3 = v1 + v2 + 5; Error -> v2 cannot be resolved to a variable
		//v2는 여기서 사용 불가능 (괄호 밖에 있기 때문)
		// 만약 고치고 싶으면 int v2를 if 괄호 밖으로 빼면 ㄱㄴ
	}
}
