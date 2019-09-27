import {Component, OnInit} from '@angular/core';
import {Users} from './users.model';
import {UserService} from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  users: Users[];
  title = 'DatesHackathonFrontEnd';

  constructor(private userService: UserService) {}
  ngOnInit() {
    this.getUsers()
    console.log(this.users);
  }

  getUsers() {
    this.userService.getUsers().subscribe(userData => {
        this.users = userData;
      },
      err => console.log(err),
      () => console.log('Getting users complete...')
    );
  }

}
