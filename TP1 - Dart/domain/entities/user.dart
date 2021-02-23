import './entities.dart';

class User extends Person {
  final String _id;
  String _login;
  String _password;

  User(
    this._id, [
    this._login = '',
    this._password = '',
  ]) : super(_id);

  // Getter's
  String get id => this._id;
  String get login => this._login;
  String get password => this._password;

  // Setter's
  set login(String login) => this._login = login;
  set password(String password) => this._password = password;
}
