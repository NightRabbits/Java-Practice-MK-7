import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainAct {

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.odcloud.kr/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TestInterface testInterface = retrofit.create(TestInterface.class);
        testInterface.getData(1, 10, "PiupwYl4E3qXUITudPuqSalNK8/yzD8jOUgFtMIZJkEB2CPsZaDBfae+UAU9MoNKBJLvaUxIlq5jY2WwzDmEeg==")
                .enqueue(new Callback<PageData>() {
                    @Override
                    public void onResponse(Call<PageData> call, Response<PageData> response) {
                        System.out.println("성공");
                    }

                    @Override
                    public void onFailure(Call<PageData> call, Throwable t) {

                    }
                });


    }
}
