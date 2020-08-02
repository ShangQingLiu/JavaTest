
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.DataFrameRelationMatrixDto;
import data.StatusType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class JacksonExample1 {
    public static void main(String argv[]) {
        String json = null;
//        String json = "{\"importantColumnList\":[{\"columnId\":62751,\"weight\":0.006622423790402481},{\"columnId\":62752,\"weight\":0.010210079853008102},{\"columnId\":62757,\"weight\":0.9687535840620746},{\"columnId\":63105,\"weight\":0.014413912294514884}]} cannot be transformed to Json object; nested exception is java.lang.IllegalArgumentException: The given string value: {\"importantColumnList\":[{\"columnId\":62751,\"weight\":0.006622423790402481},{\"columnId\":62752,\"weight\":0.010210079853008102},{\"columnId\":62757,\"weight\":0.9687535840620746},{\"columnId\":63105,\"weight\":0.014413912294514884}]}";
//        ImportanceComponentInput input = new Gson().fromJson(json, ImportanceComponentInput.class);
        DataFrameRelationMatrixDto dataFrameRelationMatrixDto = new DataFrameRelationMatrixDto();
        List<String> stringList = new ArrayList<String>();
        stringList.add("test1");
        stringList.add("test2");
        dataFrameRelationMatrixDto.setColumnNameList(stringList);
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(3.3);
        List<List<Double>> listList = new ArrayList<List<Double>>();
        listList.add(doubles);
        dataFrameRelationMatrixDto.setData(listList);
        dataFrameRelationMatrixDto.setStatusType(StatusType.Complete);
        String test ="{\"data\": [[1.0, 0.020124484004812548, 0.27747530891900996, 0.12257007337225038, 0.2756120050197495, 0.329848973668389, 0.2799703154244992, 0.011554290998594844, 0.012094845061162148, 0.18259821894351527], [0.020124484004812548, 1.0, 0.03388855494229454, 0.002415233317791171, 0.9224417608133304, 0.2694301932982181, 0.9230202004661103, 0.7350154918578643, 0.12542514232439836, 0.03772746422155178], [0.27747530891900996, 0.03388855494229454, 1.0, 0.09026538507257412, 0.35135416350426324, 0.44121315270451317, 0.35388847643306837, 0.019519211120302755, 0.011490122651134064, 0.052293851036967556], [0.12257007337225038, 0.002415233317791171, 0.09026538507257412, 1.0, 0.6519972863140989, 0.5798047456326978, 0.6524251689569891, 0.0013770726444901837, 0.0019912632788795094, 0.012104415097181083], [0.2756120050197495, 0.9224417608133304, 0.35135416350426324, 0.6519972863140989, 1.0, -0.005055677238035463, 0.9996130554678144, 0.9224447766530195, 0.9999820249167714, 0.26996877038899003], [0.329848973668389, 0.2694301932982181, 0.44121315270451317, 0.5798047456326978, -0.005055677238035463, 1.0, -0.0009221831514347923, 0.14417285794486026, 0.325122861365547, 0.13524312471091046], [0.2799703154244992, 0.9230202004661103, 0.35388847643306837, 0.6524251689569891, 0.9996130554678144, -0.0009221831514347923, 1.0, 0.922920291816297, 0.9999057916603152, 0.2739657917803572], [0.011554290998594844, 0.7350154918578643, 0.019519211120302755, 0.0013770726444901837, 0.9224447766530195, 0.14417285794486026, 0.922920291816297, 1.0, 0.11533952811648676, 0.03396131472617707], [0.012094845061162148, 0.12542514232439836, 0.011490122651134064, 0.0019912632788795094, 0.9999820249167714, 0.325122861365547, 0.9999057916603152, 0.11533952811648676, 1.0, 0.01886252828693796], [0.18259821894351527, 0.03772746422155178, 0.052293851036967556, 0.012104415097181083, 0.26996877038899003, 0.13524312471091046, 0.2739657917803572, 0.03396131472617707, 0.01886252828693796, 1.0]], \"dataColumnIds\": [62754, 62749, 62756, 62753, 62751, 62757, 62752, 62748, 62750, 62755]} cannot be transformed to Json object; nested exception is java.lang.IllegalArgumentException: The given string value: {\"data\": [[1.0, 0.020124484004812548, 0.27747530891900996, 0.12257007337225038, 0.2756120050197495, 0.329848973668389, 0.2799703154244992, 0.011554290998594844, 0.012094845061162148, 0.18259821894351527], [0.020124484004812548, 1.0, 0.03388855494229454, 0.002415233317791171, 0.9224417608133304, 0.2694301932982181, 0.9230202004661103, 0.7350154918578643, 0.12542514232439836, 0.03772746422155178], [0.27747530891900996, 0.03388855494229454, 1.0, 0.09026538507257412, 0.35135416350426324, 0.44121315270451317, 0.35388847643306837, 0.019519211120302755, 0.011490122651134064, 0.052293851036967556], [0.12257007337225038, 0.002415233317791171, 0.09026538507257412, 1.0, 0.6519972863140989, 0.5798047456326978, 0.6524251689569891, 0.0013770726444901837, 0.0019912632788795094, 0.012104415097181083], [0.2756120050197495, 0.9224417608133304, 0.35135416350426324, 0.6519972863140989, 1.0, -0.005055677238035463, 0.9996130554678144, 0.9224447766530195, 0.9999820249167714, 0.26996877038899003], [0.329848973668389, 0.2694301932982181, 0.44121315270451317, 0.5798047456326978, -0.005055677238035463, 1.0, -0.0009221831514347923, 0.14417285794486026, 0.325122861365547, 0.13524312471091046], [0.2799703154244992, 0.9230202004661103, 0.35388847643306837, 0.6524251689569891, 0.9996130554678144, -0.0009221831514347923, 1.0, 0.922920291816297, 0.9999057916603152, 0.2739657917803572], [0.011554290998594844, 0.7350154918578643, 0.019519211120302755, 0.0013770726444901837, 0.9224447766530195, 0.14417285794486026, 0.922920291816297, 1.0, 0.11533952811648676, 0.03396131472617707], [0.012094845061162148, 0.12542514232439836, 0.011490122651134064, 0.0019912632788795094, 0.9999820249167714, 0.325122861365547, 0.9999057916603152, 0.11533952811648676, 1.0, 0.01886252828693796], [0.18259821894351527, 0.03772746422155178, 0.052293851036967556, 0.012104415097181083, 0.26996877038899003, 0.13524312471091046, 0.2739657917803572, 0.03396131472617707, 0.01886252828693796, 1.0]], \"dataColumnIds\": [62754, 62749, 62756, 62753, 62751, 62757, 62752, 62748, 62750, 62755]}";
        try {
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(dataFrameRelationMatrixDto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("jackson: " + json);
        try {
            System.out.println("Gson: " +  new Gson().toJson(json));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}