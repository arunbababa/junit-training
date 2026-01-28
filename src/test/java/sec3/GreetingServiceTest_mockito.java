package sec3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest_mockito {

    @Mock
    TimeProvider mockTimeProvider;

    @InjectMocks
    GreetingService greetingService;
    // これで@Mockで作られたTimeProviderモックをgreetingServiceに自動で注入してくれる(DI)
    // コンストラクタやセッター経由でTimeProviderが差し替えられる

    @Test
    void 朝の挨拶を返す(){
        // mockTimeProvider.getCurrentTime()を呼び出したときに、9:00を返すように設定
        doReturn(LocalTime.of(9, 0)).when(mockTimeProvider).getCurrentTime(); // わかりやすｗｗｗｗｗ そのまんまだ
        assertEquals("おはようございます", greetingService.getGreeting());
    }

    @Test
    void 山田に対して昼を返す(){
        doReturn("昼").when(mockTimeProvider).getTimeLabelForName("山田");
        assertEquals("昼", mockTimeProvider.getTimeLabelForName("山田"));
    }
}