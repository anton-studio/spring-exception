/**
 * @作者 7七月
 * @微信公号 林间有风
 * @开源项目 $ http://7yue.pro
 * @免费专栏 $ http://course.7yue.pro
 * @我的课程 $ http://imooc.com/t/4294850
 * @创建时间 2019-12-27 17:09
 */
package cloud.anton.error.sample.hero;

import cloud.anton.error.sample.ISkill;

//@Component
public class Irelia implements ISkill {
    public Irelia() {
        System.out.println("Hello,7yue");
    }
    public void q(){
        System.out.println("Irelia Q");
    }

    public void w(){
        System.out.println("Irelia W");
    }

    public void e(){
        System.out.println("Irelia E");
    }

    public void r(){
        System.out.println("Irelia R");
    }
}