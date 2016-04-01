import com.MainLibrary.*

class BootStrap {

    def init = { servletContext ->

   def librarian1 = new Librarian( name: 'jeff',
                                  email: 'jeff@hotmail.co.uk',
                               username: 'jeff123',
                               password: 'randyjeff1',
                              telephone: '0114 1234567').save()

   def librarian2 = new Librarian( name: 'Sarlene',
                                  email: 'saralene@hotmail.co.uk',
                               username: 'sarlene0',
                               password: 'sarlene123',
                              telephone: '0114 7654321').save()

   def librarian3 = new Librarian( name: 'Will',
                                  email: 'Will@hotmail.co.uk',
                               username: 'will23',
                               password: 'will2323',
                              telephone: '0114 1243567').save()

   def course1 = new Course(      title: 'Computing',
                                  tutor: 'Candice',
                                   code: 'com123',
                             department: 'ASEC',
                            description: 'The computing department').save()

   def course2 = new Course(      title: 'History',
                                  tutor: 'Lesley',
                                   code: 'his123',
                             department: 'Arts',
                            description: 'The department of arts').save()

   def course3 = new Course(      title: 'Physics',
                                  tutor: 'Phillip',
                                   code: 'phy123',
                             department: 'Sciences',
                            description: 'Department of Sciences').save()

   def student1 = new Student(     name: 'Joe',
                                  email: 'joe@hotmail.co.uk',
                              studentId: 'joe123',
                                 course: 'Computing').save()

   def student2 = new Student(     name: 'Liam',
                                  email: 'liam@hotmail.co.uk',
                              studentId: 'liam123',
                                 course: 'Physics').save()

   def student3 = new Student(     name: 'Frank',
                                  email: 'frank@hotmail.co.uk',
                              studentId: 'frank123',
                                 course: 'History').save()

    def library1 = new Library( location: 'Sheffield',
                            openingHours: '24/7',
                                    book: 'Of Mice And Men',
                                 student: 'Cody',
                               librarian:  librarian1).save()
 
    def library2 = new Library( location: 'Manchester',
                            openingHours: '24/7',
                                    book: 'The Fury',
                                 student: 'Steve',
                               librarian:  librarian2).save()
 
    def library3 = new Library( location: 'Glasgow',
                            openingHours: '24/7',
                                    book: 'Loch Ness Myths',
                                 student: 'Jimmy',
                               librarian:  librarian3).save()

   def book1 = new Book(          title: 'Gatsby',
                                 author: 'The Great Gatsby',
                                   isbn: '123456789',
                           dateBorrowed: new Date('20/06/2015'),
                             returnDate: new Date('17/07/2016'),
                                student: 'Frank').save()

   def book2 = new Book(          title: 'Harry Potter',
                                 author: 'that woman',
                                   isbn: '987654321',
                           dateBorrowed: new Date('10/01/2014'),
                             returnDate: new Date('12/11/2015'),
                                student: 'Liam').save()

   def book3 = new Book(          title: 'The Fury',
                                 author: 'Some Angry Fella',
                                   isbn: '918273645',
                           dateBorrowed: new Date('10/01/2013'),
                             returnDate: new Date('13/02/2014'),
                                student: 'Joe').save()




    }
    def destroy = {
    }
}
