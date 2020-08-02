package data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataFrameRelationMatrixDto {

        private static final long serialVersionUID = 7304517912407154843L;
        @JsonProperty("columnNameList")
        @SerializedName("columnNameList")
        private List<String> columnNameList;

        @JsonProperty("data")
        @SerializedName("data")
        private List<List<Double>> data;

        @JsonProperty("statusType")
        @SerializedName("statusType")
        private StatusType statusType;
}
