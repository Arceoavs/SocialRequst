package de.wwu.acse.socialrequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.wwu.acse.leaderboard.wsdl.Leaderboard;
import de.wwu.acse.socialrequest.consumer.LeaderboardSoapClient;
import de.wwu.acse.socialrequest.exception.ServiceUnavailableException;

@Controller
@RequestMapping("/leaderboard")
public class LeaderboardController {

  @Autowired
  private LeaderboardSoapClient leaderboardClient;

  @GetMapping("/all-time")
  public String showAllTimeLeaderboard(Model model) {
    Leaderboard leaderboard = leaderboardClient.getAllTimeLeaderboard();

    if (leaderboard != null) {
      model.addAttribute("leaderboardTitle", "All-Time Leaderboard");
      model.addAttribute("leaderboard", leaderboard);

      return "leaderboard/show";
    }
    
    throw new ServiceUnavailableException();
  }

  @GetMapping("/current-month")
  public String showMonthlyLeaderboard(Model model) {
    Leaderboard leaderboard = leaderboardClient.getMonthlyLeaderboard();

    if (leaderboard != null) {
      model.addAttribute("leaderboardTitle", "Current Month Leaderboard");
      model.addAttribute("leaderboard", leaderboard);

      return "leaderboard/show";
    }

    throw new ServiceUnavailableException();
  }

}
