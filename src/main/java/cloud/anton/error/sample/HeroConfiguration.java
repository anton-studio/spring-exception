/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-28 08:54
 */
package cloud.anton.error.sample;


import cloud.anton.error.sample.hero.Diana;
import cloud.anton.error.sample.hero.Irelia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
//    @Bean
    public ISkill diana() {
        return new Diana("Diana", 18);
    }

    @Bean
    public ISkill irelia() {
        return new Irelia();
    }


}

