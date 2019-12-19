package com.example.layam12.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.layam12.model.Mad

class MadViewModel(application: Application) : AndroidViewModel(application) {
    val mads by lazy { MutableLiveData<List<Mad>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loadind by lazy { MutableLiveData<Boolean>() }


    fun refresh() {
        getMads()

    }

    private fun getMads() {
        var mas1 = arrayListOf<Mad>()



        mas1.add(Mad("בצת","https://www.windguru.cz/station/1011"))
        mas1.add(Mad("שבי ציון","https://www.windguru.cz/station/2049"))
        mas1.add(Mad("ארגמן-עכו","https://www.windguru.cz/station/2050"))
        mas1.add(Mad("כנסיה-בת גלים","https://www.windguru.cz/station/1112"))
        mas1.add(Mad("-חוף דדו-נירוונה","https://www.windguru.cz/station/468"))
        mas1.add(Mad("-בית ינאי","https://asabro.co.il/%D7%A0%D7%AA%D7%95%D7%A0%D7%99-%D7%9E%D7%96%D7%92-%D7%90%D7%95%D7%95%D7%99%D7%A8/?fbclid=IwAR11KCJ_y7c2jntoCiFkpU5pniM7zHDnhijZBK6N7ePPtRtOiozzVUqPVRQ"))
        mas1.add(Mad("משאבות-כנרת","https://www.windguru.cz/station/973"))
        mas1.add(Mad("כפר נחום-כנרת","https://www.windguru.cz/station/1206"))
        mas1.add(Mad("מגדל-כנרת","https://www.windguru.cz/station/1909"))
        mas1.add(Mad("שיקמונה-מכון","https://isramar.ocean.org.il/isramar2009/Haifa/"))
        mas1.add(Mad("שדות ים-פריגל","https://wind.co.il/%d7%9e%d7%96%d7%92-%d7%90%d7%95%d7%99%d7%a8/%d7%a9%d7%99%d7%93%d7%95%d7%a8-%d7%97%d7%99/"))
        mas1.add(Mad("קרית ים-הורוביץ","http://www.surfo.co.il/%D7%9E%D7%96%D7%92-%D7%90%D7%95%D7%95%D7%99%D7%A8"))
        mas1.add(Mad("אילת-מרכז גלישה","http://surfcenter.co.il/%D7%9E%D7%93-%D7%A8%D7%95%D7%97/#cam"))
        mas1.add(Mad("אילת-ניטור לאומי","http://www.meteo-tech.co.il/eilat-yam/eilat_he.asp"))

        mads.value = mas1
        loadError.value = false
        loadind.value = false
    }

}
/*

this.mExampleList.add(new ExampleItem("https://www.windguru.cz/station/973", "משאבות", "https://cdn.pixabay.com/photo/2014/08/11/17/22/windsurfing-415773_960_720.jpg"));
this.mExampleList.add(new ExampleItem("http://paran58.wixsite.com/seaoffgalil/blank", "מגדל", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44898810_2382904368391036_8431094353362944000_n.jpg?_nc_cat=105&_nc_ht=scontent.ftlv1-1.fna&oh=dfd722aeddd15cf04aff74362f700e63&oe=5C4A778F"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/station/1206", "כפר נחום", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/31870635_1798408916847092_5660476182676635648_n.jpg?_nc_cat=105&_nc_ht=scontent.ftlv1-1.fna&oh=146ce53268dc2a2552cab3797dbf92b9&oe=5C4D704C"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/station/468", "מעגן", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44908356_10215872153052758_1927784822290251776_n.jpg?_nc_cat=111&_nc_ht=scontent.ftlv1-1.fna&oh=516cbb3408f6d34098e338cc73b9692d&oe=5C8A170A"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/station/1011", "בצת", "https://cdn.pixabay.com/photo/2016/05/19/22/56/windsurfing-1404201_960_720.jpg"));
this.mExampleList.add(new ExampleItem("http://www.surfo.co.il/%D7%9E%D7%96%D7%92-%D7%90%D7%95%D7%95%D7%99%D7%A8", "קרית ים", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/43728841_2035162719876903_6180731983627288576_n.jpg?_nc_cat=102&_nc_ht=scontent.ftlv1-1.fna&oh=7f9abd1e381ea6d59bc7ea335ecf0b11&oe=5C4CE7D6"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/station/1112", "בת גלים", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44908326_10215873332122234_1346306186680467456_n.jpg?_nc_cat=110&_nc_ht=scontent.ftlv1-1.fna&oh=5e4f63a4f92946930a0aa5e22e163679&oe=5C43BD93"));
this.mExampleList.add(new ExampleItem("http://37.142.41.42:38777/axis-cgi/mjpg/video.cgi?resolution=800x450&compression=30&clock=0&date=0", "חוף דדו", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44814294_2141710932527304_1891019197861855232_n.jpg?_nc_cat=103&_nc_ht=scontent.ftlv1-1.fna&oh=96181be126cd1efcfe831f6f7640af55&oe=5C7EDED0"));
this.mExampleList.add(new ExampleItem("https://isramar.ocean.org.il/isramar2009/Haifa/", "שקמונה", "https://cdn.pixabay.com/photo/2018/04/15/23/42/waves-3323207_960_720.jpg"));
this.mExampleList.add(new ExampleItem("http://wind.co.il/%D7%9E%D7%96%D7%92-%D7%90%D7%95%D7%99%D7%A8/%D7%A9%D7%99%D7%93%D7%95%D7%A8-%D7%97%D7%99/", "קיסריה פריגל", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44830385_10156594176598604_7644270118695862272_n.jpg?_nc_cat=103&_nc_ht=scontent.ftlv1-1.fna&oh=74abb0b37413f7feeb8fb5fe242a150e&oe=5C87E6F1"));
this.mExampleList.add(new ExampleItem("http://surfcenter.co.il/%D7%9E%D7%93-%D7%A8%D7%95%D7%97/#cam", "אילת", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/42177581_1851437431560579_1474308646031589376_n.jpg?_nc_cat=109&_nc_ht=scontent.ftlv1-1.fna&oh=c7f03a3b53d3249eef8f6615991fd71b&oe=5C862CEA"));
this.mExampleList.add(new ExampleItem("http://www.meteo-tech.co.il/eilat-yam/eilat_he.asp", "אילת-ניטור לאומי", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44808469_2030279340326714_3735598975936364544_n.jpg?_nc_cat=104&_nc_ht=scontent.ftlv1-1.fna&oh=8e9408b912f95f32f696f8ccf8965695&oe=5C42528F"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/583", "WindGuru כנרת", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44854996_2030279230326725_7543331042845786112_n.jpg?_nc_cat=106&_nc_ht=scontent.ftlv1-1.fna&oh=53a905e8d4587185b0bb5ce457aa8c5a&oe=5C4C2159"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/671967", "WindGuru בצת", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44889671_1894065047297817_2349694474981998592_n.jpg?_nc_cat=105&_nc_ht=scontent.ftlv1-1.fna&oh=79d2ddbf2c71b1a8bcd44bb086877b32&oe=5C4350CA"));
this.mExampleList.add(new ExampleItem("https://www.windguru.cz/692818", "WindGuru בת גלים", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/42045286_1849998228371166_703474248190001152_n.jpg?_nc_cat=108&_nc_ht=scontent.ftlv1-1.fna&oh=0f568057fc9acd564636e6cdffa0893f&oe=5C850C2D"));
this.mExampleList.add(new ExampleItem("http://www.mazgal.co.il/#!/stations/ESHHAR/days/1", "אשחר", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/42058779_1849998928371096_1447980505097043968_n.jpg?_nc_cat=105&_nc_ht=scontent.ftlv1-1.fna&oh=ee312b892f7f3bb8f0577219bdde4049&oe=5C4D4F43"));
this.mExampleList.add(new ExampleItem("http://www.mazgal.co.il/#!/stations/SHAVE%20ZIYYON/days/1", "שבי ציון", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/41991208_1849997881704534_5900294482036785152_n.jpg?_nc_cat=102&_nc_ht=scontent.ftlv1-1.fna&oh=58b9ade9043d2f0383bcf9df2b86b341&oe=5C79BA41"));
this.mExampleList.add(new ExampleItem("http://old.govmap.gov.il/app10", "Govmap - נתוני רוח בזמן אמת", "https://scontent.ftlv1-1.fna.fbcdn.net/v/t1.0-9/44719471_2382904165057723_2090245108472479744_n.jpg?_nc_cat=105&_nc_ht=scontent.ftlv1-1.fna&oh=c9a00020f7066385f8f26db3e57fb34c&oe=5C7AA2B2"));
*/
