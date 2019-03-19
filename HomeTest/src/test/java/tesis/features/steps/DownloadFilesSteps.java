package tesis.features.steps;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.model.DataTable;
import tesis.environment.Messages;
import tesis.environment.Variables;
import tesis.pages.DownloadPage;
import utils.FileDownloader;

public class DownloadFilesSteps extends BaseSteps {

	DownloadPage downloadPage;

	@Given("^user is in the home page$")
	public void user_is_in_the_home_page() throws Exception {
		downloadPage.open();

	}

	@When("^the user download the desired files pasing the file title \"([^\"]*)\"$")
	public void the_user_download_the_desired_files_pasing_the_file_title(String title) throws Exception {
		List<String> filesNames = downloadPage.downloadWinFiles(title);
		context.put("downloadedFiles", filesNames);

	}
	
	@When("^the user download the desired files pasing the file id (\\d+)$")
	public void the_user_download_the_desired_files_pasing_the_file_id(int id) throws Exception {
		List<String> filesNames = downloadPage.downloadWinFiles(id);
		context.put("downloadedFiles", filesNames);

	}

	@Then("^the user must be able to see the downloaded files within the corresponding directory$")
	public void the_user_must_be_able_to_see_the_downloaded_files_within_the_corresponding_directory()
			throws Exception {
		boolean fileExists = FileDownloader.isFileDownloaded(Variables.PATH,
				(List<String>) context.get("downloadedFiles"));
		Assert.assertTrue(Messages.DOWNLOAD_SUCCESSFULLY, fileExists);

	}

}
