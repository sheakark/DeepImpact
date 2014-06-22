package models

/**
 * Created by shekalukate on 5/25/2014.
 */

import play.api.db._

import scala.slick.driver.H2Driver.simple._

case class User(username: String, password: String)

class Users(tag: Tag) extends Table[(Int, String, String, String, String)](tag,"User")
{
  def userid =column[Int]("userid",O.PrimaryKey)
  def email=column[String]("email")
  def password=column[String]("password")
  def firstname=column[String]("firstname")
  def lastname=column[String]("lastname")

  def * = (userid, email, password, firstname, lastname)
 }
