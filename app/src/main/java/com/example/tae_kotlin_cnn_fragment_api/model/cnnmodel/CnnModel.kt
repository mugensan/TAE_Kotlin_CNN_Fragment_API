import com.example.tae_kotlin_cnn_fragment_api.model.Articles
import com.google.gson.annotations.SerializedName

data class CnnModel (

	@SerializedName("status") val status : String,
	@SerializedName("totalResults") val totalResults : Int,
	@SerializedName("articles") val articles : List<Articles>
)